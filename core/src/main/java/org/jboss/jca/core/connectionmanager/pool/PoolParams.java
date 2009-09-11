/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008-2009, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.jca.core.connectionmanager.pool;

/**
 * Pooling parameters. 
 * @author <a href="mailto:gurkanerdogdu@yahoo.com">Gurkan Erdogdu</a>
 * 
 * @version $Rev$ $Date$
 */
public class PoolParams
{
   /** Minumum size of the pool */
   private int minSize;

   /** Maximum size of the pool */
   private int maxSize = 10;

   /**Blocking timeout. In milliseconds*/
   private int blockingTimeout = 30000;
   
   /**Idle timeout period. Default 30 mins. In milliseconds*/
   private long idleTimeout = 1000 * 60 * 30;
   
   /**Background validation interval*/
   private long backgroundValidationInterval = 0;
   
   /**Prefill pool*/
   private boolean prefill;
   
   /**Strict minumum, default false*/
   private boolean strictMin;

   /**Do we want to immeadiately break when a connection cannot be matched and
   *  not evaluate the rest of the pool? 
   */
   private boolean useFastFail;

   /**
    * @return the minSize
    */
   public int getMinSize()
   {
      return minSize;
   }

   /**
    * @param minSize the minSize to set
    */
   public void setMinSize(int minSize)
   {
      this.minSize = minSize;
   }

   /**
    * @return the maxSize
    */
   public int getMaxSize()
   {
      return maxSize;
   }

   /**
    * @param maxSize the maxSize to set
    */
   public void setMaxSize(int maxSize)
   {
      this.maxSize = maxSize;
   }

   /**
    * @return the blockingTimeout
    */
   public int getBlockingTimeout()
   {
      return blockingTimeout;
   }

   /**
    * @param blockingTimeout the blockingTimeout to set
    */
   public void setBlockingTimeout(int blockingTimeout)
   {
      this.blockingTimeout = blockingTimeout;
   }

   /**
    * @return the idleTimeout
    */
   public long getIdleTimeout()
   {
      return idleTimeout;
   }

   /**
    * @param idleTimeout the idleTimeout to set
    */
   public void setIdleTimeout(long idleTimeout)
   {
      this.idleTimeout = idleTimeout;
   }

   /**
    * @return the backgroundInterval
    */
   public long getBackgroundValidationInterval()
   {
      return backgroundValidationInterval;
   }

   /**
    * @param backgroundValidationInterval the backgroundInterval to set
    */
   public void setBackgroundValidationInterval(long backgroundValidationInterval)
   {
      this.backgroundValidationInterval = backgroundValidationInterval;
   }

   /**
    * @return the prefill
    */
   public boolean isPrefill()
   {
      return prefill;
   }

   /**
    * @param prefill the prefill to set
    */
   public void setPrefill(boolean prefill)
   {
      this.prefill = prefill;
   }

   /**
    * @return the strictMin
    */
   public boolean isStrictMin()
   {
      return strictMin;
   }

   /**
    * @param strictMin the strictMin to set
    */
   public void setStrictMin(boolean strictMin)
   {
      this.strictMin = strictMin;
   }

   /**
    * @return the useFastFail
    */
   public boolean isUseFastFail()
   {
      return useFastFail;
   }

   /**
    * @param useFastFail the useFastFail to set
    */
   public void setUseFastFail(boolean useFastFail)
   {
      this.useFastFail = useFastFail;
   }

   
}