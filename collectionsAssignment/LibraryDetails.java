package com.jsp.collectionsAssignment;

public class LibraryDetails implements Comparable<LibraryDetails>
{
		String bookName;
		String authorName;
	    long bookId;
		int duration;
		
		public LibraryDetails(String bookName, String authorName, long bookId, int duration)
		{
			super();
			this.bookName = bookName;
			this.authorName = authorName;
			this.bookId = bookId;
			this.duration = duration;
		}
        @Override
        public String toString()
        {
			
        	return "[ bookName: "+bookName +" , authorName: "+authorName+" , bookId: "+bookId+ " duration: "+duration+" ]";
        }	

	@Override
	public int compareTo(LibraryDetails o) {
		// TODO Auto-generated method stub
		 return this.duration-o.duration;
	}
	

}
