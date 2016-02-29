/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 29 07:34:10 GMT 2016
 */

package com.rickhanberryfinal.services.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.rickhanberryfinal.entities.Ingredients;
import com.rickhanberryfinal.services.impl.IngredientsServiceImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IngredientsServiceImpl_ESTest extends IngredientsServiceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IngredientsServiceImpl ingredientsServiceImpl0 = new IngredientsServiceImpl();
      // Undeclared exception!
      try { 
        ingredientsServiceImpl0.findAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.services.impl.IngredientsServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IngredientsServiceImpl ingredientsServiceImpl0 = new IngredientsServiceImpl();
      // Undeclared exception!
      try { 
        ingredientsServiceImpl0.findOne((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.services.impl.IngredientsServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IngredientsServiceImpl ingredientsServiceImpl0 = new IngredientsServiceImpl();
      // Undeclared exception!
      try { 
        ingredientsServiceImpl0.save((Ingredients) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.services.impl.IngredientsServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IngredientsServiceImpl ingredientsServiceImpl0 = new IngredientsServiceImpl();
      // Undeclared exception!
      try { 
        ingredientsServiceImpl0.delete((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.services.impl.IngredientsServiceImpl", e);
      }
  }
}
