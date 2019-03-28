
public class BinaryNode{

	private BinaryNode rightChild;
	private BinaryNode leftChild;
	private int data;
	
	public BinaryNode(int data, BinaryNode right, BinaryNode left) {
		this.data = data;
		rightChild = right;
		leftChild = left;
	}
	
	//toString in GenericNode class
	
	public void print(int depth){
		int i;
		for(i = 1; i <= depth; i++){
			System.out.println(" ");
			System.out.println(this.getData());
			
			if(getLeftChild() != null){
				getLeftChild().print(depth+1);
			}else if(getRightChild() != null){
				for(i = 1; i <= depth+1; i++){
					System.out.println(" ");
					System.out.println("--");
				}
			}
			
			if(getRightChild() != null){
				getRightChild().print(depth+1);
			}else if(getLeftChild() != null){
				for(i = 1; i <= depth+1; i++){
					System.out.println(" ");
					System.out.println("--");
				}
			}
		}
	}
	
	public boolean isLeaf(){
		return (getRightChild() == null && getLeftChild() == null ? true : false);
	}
	
	public BinaryNode getRightChild(){
		return rightChild;
	}
	
	public BinaryNode getLeftChild(){
		return leftChild;
	}
	
	public int getData(){
		return data;
	}
	
	public void setRightChild(BinaryNode right){
		rightChild = right;
	}
	
	public void setLeftChild(BinaryNode left){
		leftChild = left;
	}
	
	public void setData(int data){
		this.data = data;
	}
}