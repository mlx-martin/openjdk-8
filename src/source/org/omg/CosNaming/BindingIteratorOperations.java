package org.omg.CosNaming;


/**
* org/omg/CosNaming/BindingIteratorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/jenkins/workspace/build-scripts/jobs/jdk8u/jdk8u-mac-x64-hotspot/workspace/build/src/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 09 November 2020 12:07:44 o'clock GMT
*/


/**
   * The BindingIterator interface allows a client to iterate through
   * the bindings using the next_one or next_n operations.
   * 
   * The bindings iterator is obtained by using the <tt>list</tt>
   * method on the <tt>NamingContext</tt>. 
   * @see org.omg.CosNaming.NamingContext#list
   */
public interface BindingIteratorOperations 
{

  /**
       * This operation returns the next binding. If there are no more
       * bindings, false is returned.
       * 
       * @param b the returned binding
       */
  boolean next_one (org.omg.CosNaming.BindingHolder b);

  /**
       * This operation returns at most the requested number of bindings.
       * 
       * @param how_many the maximum number of bindings tro return <p>
       * 
       * @param bl the returned bindings
       */
  boolean next_n (int how_many, org.omg.CosNaming.BindingListHolder bl);

  /**
       * This operation destroys the iterator.
       */
  void destroy ();
} // interface BindingIteratorOperations
