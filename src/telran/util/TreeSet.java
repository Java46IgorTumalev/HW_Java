package telran.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class TreeSet<T> implements SortedSet<T> {
	private static class Node<T> {
		T obj;
		Node<T> parent;
		Node<T> left;
		Node<T> right;

		Node(T obj) {
			this.obj = obj;
		}
	}

	private static final String FILL_SUMB = "->";

	private static final int N_SUMBOLS_PER_LEVEL = 2;

	private Node<T> root;
	int size;
	Comparator<T> comp;
	private Node<T> getLeastNodeFrom(Node<T> node) {
		while(node.left != null) {
			node = node.left;
		}
		return node;
	}
	private class TreeSetIterator implements Iterator<T> {
		Node<T> current = root == null ? null : getLeastNodeFrom(root);
		Node<T> prev = null;
		boolean flNext = false;
		@Override
		public boolean hasNext() {
			
			return current != null;
		}

		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			prev = current;
			T res = current.obj;
			updateCurrent();
			flNext = true;
			return res;
		}
		private void updateCurrent() {
			current = current.right != null ? getLeastNodeFrom(current.right) : getGreaterParent(current);
			
		}

		private Node<T> getGreaterParent(Node<T> node) {
			
			while(node.parent != null && node.parent.left != node) {
				node = node.parent;
			}
			return node.parent;
		}

		@Override
		public void remove() {
			if (!flNext) {
				throw new IllegalStateException();
			}
			if (isJunction(prev)) {
				current = prev;
			}
			removeNode(prev);
			flNext = false;
		}
		
	}
	public TreeSet(Comparator<T> comp) {
		this.comp = comp;
	}
	@SuppressWarnings("unchecked")
	public TreeSet() {
		this((Comparator<T>)Comparator.naturalOrder());
	}
	@Override
	public boolean add(T obj) {
		//no cycles allowed
		Node<T> newNode = new Node<>(obj);
		boolean res = add(root, newNode);
		if (res) {
			size++;
		}
		return res;
	}

	private boolean add(Node<T> parent, Node<T> newNode) {
		boolean res = true;
		if (parent == null) {
			root = newNode;
		} else {
			int resComp = comp.compare(newNode.obj, parent.obj);
			if (resComp == 0) {
				res = false;
			} else {
				if (resComp < 0) {
					if (parent.left == null) {
						insert(parent, newNode, true);//new node inserted to left from parent
					} else {
						add(parent.left, newNode);
					}
				} else {
					if (parent.right == null) {
						insert(parent, newNode, false);//new node inserted to right from parent
					} else {
						add(parent.right, newNode);
					}
				}
			}
		}
		return res;
	}
	private void insert(Node<T> parent, Node<T> newNode, boolean isLeft) {
		if (isLeft) {
			parent.left = newNode;
		} else {
			parent.right = newNode;
		}
		newNode.parent = parent;
		
	}
	private Node<T> getNodeOrParent(T obj) {
		Node<T> current = root;
		Node<T> parent = null;
		int compRes = 0;
		while (current != null) {
			parent = current;
			compRes = comp.compare(obj, current.obj);
			if (compRes == 0) {
				break;
			}
			current = compRes > 0 ? current.right : current.left;
		}
		return parent;
	}
	@Override
	public boolean remove(Object pattern) {
		boolean res = false;
		@SuppressWarnings("unchecked")
		T patternT = (T) pattern;
		Node<T> node = getNodeOrParent(patternT);
		if (node != null && comp.compare(node.obj, patternT) == 0) {
			res = true;
			removeNode(node);
		}
		
		return res;
	}

	private void removeNode(Node<T> node) {
		if (isJunction(node)) {
			removeJunctionNode(node);
		} else {
			removeNonJunctionNode(node);
		}
		size--;
		
	}
	private void removeNonJunctionNode(Node<T> node) {
		Node<T> child = node.left == null ? node.right : node.left;
		Node<T> parent = node.parent;
		if(parent == null) {
			root = child;
		} else {
			if (parent.left == node) {
				parent.left = child;
			} else {
				parent.right = child;
			}
		}
		if (child != null) {
			child.parent = parent;
		}
		
	}
	private void removeJunctionNode(Node<T> node) {
		Node<T> substitution = getLeastNodeFrom(node.right);
		node.obj = substitution.obj;
		removeNonJunctionNode(substitution);
		
	}
	private boolean isJunction(Node<T> node) {
		
		return node.left != null && node.right != null;
	}
	@Override
	public boolean contains(Object pattern) {
		@SuppressWarnings("unchecked")
		T tPattern = (T)pattern;
		Node<T> node = getNodeOrParent(tPattern);
		return node != null && comp.compare(tPattern, node.obj) == 0;
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		
		return new TreeSetIterator();
	}

	@Override
	public T first() {
		if (root == null) {
			return null;
		}
		return getLeastNodeFrom(root).obj;
	}

	
	@Override
	public T last() {
		if (root == null) {
			return null;
		}
		return getMostNodeFrom(root).obj;
	}
	private Node<T> getMostNodeFrom(Node<T> node) {
		while(node.right != null) {
			node = node.right;
		}
		return node;
	}
	public void displayRotated() {
		displayRotated(root, 0);
	}
	private void displayRotated(Node<T> root, int level) {
		if (root != null) {
			displayRotated(root.right, level + 1);
			displayRoot(root, level);
			displayRotated(root.left, level + 1);
		}
		
	}
	private void displayRoot(Node<T> root, int level) {
		System.out.printf("%s%s\n", FILL_SUMB.repeat(level * N_SUMBOLS_PER_LEVEL), root.obj);
		
	
		
	}
	
	

	public void displayAsDirectory() {
		
		displayDirectory(root, 0);
	}

	public int height() {
		
		return height(root);
	}

	private int height(Node<T> root) {
		int res = 0;
		if(root != null) {
			int heightLeft = height(root.left);
			int heightRight= height(root.right);
			res = Math.max(heightLeft, heightRight) + 1;
		}
		return res;
	}
	
	private void displayDirectory(Node<T> root, int level) {
		if(level < this.height()&&root!=null) {
		displayRoot(root, level);
		displayDirectory(root.left, level+1);
		displayDirectory(root.right, level+1);
		}
	}
	public int width() {
		
		return width(root);
	}
	

	
	private int width(Node<T> root) {
		int res = 0;
		if (root != null) {
			res = root.left == null && root.right == null ? 1 : width(root.left) + width(root.right);//  proverit
		}
			
		return res;
	}


	public void inversion() {
		//TODO 
	inversion(root);
	}

	
private void inversion(Node<T> root) {
	// TODO Auto-generated method stub
	if(root != null) {
		Node<T> X = root.left;
		root.left = root.right;
		root.right = X;
		inversion(root.left);
		inversion(root.right);
		
	}
	
}
@Override
public boolean removeIf(Predicate<T> predicate) {
	// TODO Auto-generated method stub
	return false;
}

	



	
	
	
}
