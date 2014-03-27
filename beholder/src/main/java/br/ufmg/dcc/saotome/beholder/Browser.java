/*  Copyright 2014 Ícaro Clever da Fonseca Braga

	Licensed to the Apache Software Foundation (ASF) under one
	or more contributor license agreements.  See the NOTICE file
	distributed with this work for additional information
	regarding copyright ownership.  The ASF licenses this file
	to you under the Apache License, Version 2.0 (the
	"License"); you may not use this file except in compliance
	with the License.  You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing,
	software distributed under the License is distributed on an
	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
	KIND, either express or implied.  See the License for the
	specific language governing permissions and limitations
	under the License.
 */
package br.ufmg.dcc.saotome.beholder;

import java.net.URL;

/**
 * This interface represents interactions between users and browser. It's used by testers
 * when it's necessary to execute tasks on browser. The common way is execute tasks on the 
 * application page.
 * @author Ícaro Clever F. Braga (icaroclever@gmail.com)
 * @version 1.0
 */
public interface Browser {

	/**
	 * Sends a url to be opened by browser.
	 * @param url Page's url
	 */
	void open(URL url);
	

	/**
	 * Validates if at least one occurrence of the expected text is present in the
	 * page's body.
	 * @param text
	 */
	boolean isTextPresent(final String text);
	
	/**
	 * Returns the reference to the current alert displayed.
	 * @return Alert
	 */
	Alert getAlert();
	
	/**
	 * This class represents the windows alerts displayed by browsers.
	 * @author Ícaro Clever F. Braga (icaroclever@gmail.com)
	 * @version 1.0
	 */
	public abstract class Alert {
		
		/**
		 * Confirm an alert displayed.
		 */
		public abstract void confirm();
		
		/**
		 * Cancel an alert displayed.
		 */
		public abstract void cancel();
		
		/**
		 * Text has displayed by alert.
		 */
		public abstract String getText();
		
	}
}
