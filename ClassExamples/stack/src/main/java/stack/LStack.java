package stack;

/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
*/

/** Linked stack implementation */
class LStack<E> implements Stack<E> {
  private Link<E> top;          // Pointer to first element
  private int size;		// Number of elements

  /** Constructors */
  public LStack() { 
      top = null; 
      size = 0; 
  }
  
  public LStack(int size) { 
      top = null; 
      this.size = 0; 
  }

  /** Reinitialize stack */
  @Override
  public void clear() { 
      top = null; 
      size = 0; 
  }
  
  /** Put "it" on stack */
  @Override
  public void push(E it) {
    top = new Link<>(it, top);
    size++;
  }

  /** Remove "it" from stack */
  @Override
  public E pop() {
    assert top != null : "Stack is empty";
    E it = top.element();
    top = top.next();
    size--;
    return it;
  }

  /** @return Top value */
  @Override
  public E topValue() {
    assert top != null : "Stack is empty";
    return top.element();
  }

  /** @return Stack length */
  @Override
  public int length() { 
      return size; 
  }

// Extra stuff not printed in the book.

  /**
   * Generate a human-readable representation of this stack's contents
   * that looks something like this: < 1 2 3 >.
   * This method uses toString() on the individual elements.
   * @return The string representation of this stack
   */
  @Override
  public String toString()
  {
    StringBuilder out = new StringBuilder((length() + 1) * 4);
    out.append("< ");
    Link<E> temp = top;
    while (temp != null) {
      out.append(temp.element());
      out.append(" ");
      temp = temp.next();
    }
    out.append(">");
    return out.toString();
  }
}