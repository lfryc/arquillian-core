/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.container.test.impl.client.deployment.command;

import java.io.Serializable;

import org.jboss.arquillian.container.test.spi.command.Command;

/**
 * AbstractCommand
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public abstract class AbstractCommand<T> implements Command<T>, Serializable
{
   private static final long serialVersionUID = 1L;

   private T result;
   private Throwable throwable;
   
   public void setResult(T result) 
   {
      this.result = result;
   }

   @Override
   public T getResult()
   {
      return result;
   }

   @Override
   public void setThrowable(Throwable throwable)
   {
      this.throwable = throwable;
   }
   
   /**
    * @return the throwable
    */
   @Override
   public Throwable getThrowable()
   {
      return throwable;
   }
}
