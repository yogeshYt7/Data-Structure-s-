package DSA;

public class SDAmainclass {
public static void main(String[] args) {
	SingleDimesionalArray sda=new SingleDimesionalArray(5);
	sda.sdaInsertion(1,20);
	sda.sdaInsertion(0,10);
	sda.sdaInsertion(3,40);
	sda.sdaInsertion(2,30);
	sda.sdaInsertion(4,50);
	sda.sdaTraversal();
	sda.sdaSearch(20);
	sda.sdaDeletion(17);
}
}
