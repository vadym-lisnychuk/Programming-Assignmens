public class NewAltList<E>
{
   class Node
   {
      E element;
      Node next;
      
      public Node(E element)
      {
         this.element = element;
         this.next = null;
      }
   }
   
   private Node head;
   private Node tail;
   private int size = 0;
   
   /* TODO: This method should add the element to the beginning of 
            of the list and increase the size of the list by one. */
   public void addBeginning(E element)
   {
      if(size == 0){
         head = new Node(element);
         tail = head;
      }
      else{
         Node temp = new Node(element);
         
         temp.next = head;
         head = temp;
      }

      this.size++;
   }

   /* TODO: This method should add the element to the end of 
            of the list and increase the size of the list by one. */   
   public void addEnd(E element)
   {
           if(size==0){
            this.head = new Node(element);
            this.tail = this.head;
        }
        else{
            tail.next = new Node(element);
            tail = tail.next;
        }
        size++;
   }

   public E get(int index)
   {
      if(index < 0 || index > size - 1)
      {
         throw new IndexOutOfBoundsException();
      }
      
      Node node = head;
      for(int i = 0; i < index; i++)
      {
         node = node.next;
      }
   
      return node.element;
   }
      
   public int size()
   {
      return size;
   }
   
   public Node getHead()
   {
      return head;
   }
   
   public Node getTail()
   {
      return tail;
   }
}