/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 29 15:05:45 GMT 2016
 */

package com.rickhanberryfinal.evosuite.services.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.rickhanberryfinal.entities.Allergens;
import com.rickhanberryfinal.services.impl.AllergensServiceImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AllergensServiceImpl_ESTest extends AllergensServiceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AllergensServiceImpl allergensServiceImpl0 = new AllergensServiceImpl();
      // Undeclared exception!
      try { 
        allergensServiceImpl0.save((Allergens) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.services.impl.AllergensServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AllergensServiceImpl allergensServiceImpl0 = new AllergensServiceImpl();
      // Undeclared exception!
      try { 
        allergensServiceImpl0.findOne((Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.services.impl.AllergensServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AllergensServiceImpl allergensServiceImpl0 = new AllergensServiceImpl();
      Long long0 = new Long(1846L);
      // Undeclared exception!
      try { 
        allergensServiceImpl0.delete(long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.services.impl.AllergensServiceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AllergensServiceImpl allergensServiceImpl0 = new AllergensServiceImpl();
      // Undeclared exception!
      try { 
        allergensServiceImpl0.findAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.services.impl.AllergensServiceImpl", e);
      }
  }
}