package lab3;

public class List {

	private ListElement head;
	private int count;
		
	public List()
	{
		head = null;
	}
		
	public void addElement(ListElement le)
	{
		if(count == 0)
		{
			head.setNext(le);
			count++;
		}
		else
		{
			count++;
			ListElement temp = head;
			while(temp.getNext()!=null)
			{
				temp = temp.getNext();
			}
			temp.setNext(le);
		}
	}
	
	public ListElement getElement(int index)
	{
		ListElement temp = head;
		for(int i = 0; i < index; i++)
		{
			temp = temp.getNext();
		}
		return temp;
	}
	
	public void deleteElement(int index)
	{
		ListElement temp1 = head;
		ListElement temp2 = head;
		for(int i = 0; i < index; i++)
		{
			temp1 = temp1.getNext();
		}
		for(int i = 0; i < index - 1; i++)
		{
			temp2 = temp2.getNext();
		}
		temp2.setNext(temp1.getNext());
		count--;
	
	}
	
	public void printLinkedListHead()
	{
		{
		ListElement temp = head;
		System.out.print("List: ");
		do
		{
		System.out.print(temp.getData());
		if(temp.getNext()!=null)
		{
			System.out.print(", ");
		}
		temp = temp.getNext();
		}while(temp.getNext()!=null);	
		}
	}
	
	public void printLinkedListTail()
	{
		ListElement temp = head;
		if(temp.getNext() != null)
		{
			
		}
	}
	
	public int getCount()
	{
		return count;
	}
}
