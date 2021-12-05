
public class Qst3 {}
package pack1;

class A
{
    public A()
    {
        //public constructor
    }
}
 
package pack2;
 
import pack1.*;
 
class B
{
    A a = new A();   	//Compile Time Error
}



//yes,their will be compile time error
//because class A is hidden and class A is of default type and default type is accessible only with in the same package
//so class should be of public type it can be accesses from any where
//modified code

package pack1;

public class A{
  public A()
  {
      //public constructor
  }
}

package pack2;

import pack1.*;

class B
{
  A a = new A();   	
}