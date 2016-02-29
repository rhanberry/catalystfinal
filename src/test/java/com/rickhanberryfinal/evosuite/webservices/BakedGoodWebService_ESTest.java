/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 29 15:04:10 GMT 2016
 */

package com.rickhanberryfinal.evosuite.webservices;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.rickhanberryfinal.entities.BakedGood;
import com.rickhanberryfinal.webservices.BakedGoodWebService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BakedGoodWebService_ESTest extends BakedGoodWebService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BakedGoodWebService bakedGoodWebService0 = new BakedGoodWebService();
      BakedGood bakedGood0 = new BakedGood();
      // Undeclared exception!
      try { 
        bakedGoodWebService0.updateBakedGood(bakedGood0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.webservices.BakedGoodWebService", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BakedGood bakedGood0 = new BakedGood();
      Long long0 = new Long(22L);
      bakedGood0.setId(long0);
      BakedGoodWebService bakedGoodWebService0 = new BakedGoodWebService();
      // Undeclared exception!
      try { 
        bakedGoodWebService0.updateBakedGood(bakedGood0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.webservices.BakedGoodWebService", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BakedGoodWebService bakedGoodWebService0 = new BakedGoodWebService();
      BakedGood bakedGood0 = new BakedGood();
      Long long0 = new Long(1631L);
      bakedGood0.setId(long0);
      ResponseEntity<BakedGood> responseEntity0 = bakedGoodWebService0.createBakedGood(bakedGood0);
      assertEquals(HttpStatus.BAD_REQUEST, responseEntity0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BakedGoodWebService bakedGoodWebService0 = new BakedGoodWebService();
      BakedGood bakedGood0 = new BakedGood();
      // Undeclared exception!
      try { 
        bakedGoodWebService0.createBakedGood(bakedGood0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.webservices.BakedGoodWebService", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BakedGoodWebService bakedGoodWebService0 = new BakedGoodWebService();
      Long long0 = new Long(1095L);
      // Undeclared exception!
      try { 
        bakedGoodWebService0.deleteBakedGood(long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.webservices.BakedGoodWebService", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BakedGoodWebService bakedGoodWebService0 = new BakedGoodWebService();
      // Undeclared exception!
      try { 
        bakedGoodWebService0.getAllBakedGoods();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.webservices.BakedGoodWebService", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Long long0 = new Long((-1084L));
      BakedGoodWebService bakedGoodWebService0 = new BakedGoodWebService();
      // Undeclared exception!
      try { 
        bakedGoodWebService0.getBakedGood(long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("com.rickhanberryfinal.webservices.BakedGoodWebService", e);
      }
  }
}
