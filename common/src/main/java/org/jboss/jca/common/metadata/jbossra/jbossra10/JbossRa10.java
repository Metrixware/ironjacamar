/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.jca.common.metadata.jbossra.jbossra10;

import org.jboss.jca.common.metadata.jbossra.JbossRa;
import org.jboss.jca.common.metadata.jbossra.jbossra20.RaConfigProperty;

import java.util.List;

/**
 *
 * A JbossRa10.
 *
 * @author <a href="stefano.maestri@jboss.com">Stefano Maestri</a>
 *
 */
public class JbossRa10 extends JbossRa
{

   /** The serialVersionUID */
   private static final long serialVersionUID = 1L;

   /**
    * @param raConfigProperties List of properties for configuration
    *
    */
   public JbossRa10(List<RaConfigProperty<?>> raConfigProperties)
   {
      super(raConfigProperties);
   }

   @Override
   public String toString()
   {
      return "JbossRa10 [getRaConfigProperties()=" + getRaConfigProperties() + "]";
   }

}