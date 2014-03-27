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
package br.ufmg.dcc.saotome.beholder.ui.table;

import br.ufmg.dcc.saotome.beholder.ui.event.Clickable;

/** Cell class represents a element cell of a HTML table. Text content are the unique information recovered from cells.
 *  So, this interface doesn't interact with components inside of a cell.
 * @author icaroclever
 */
public interface Cell extends Clickable{

	/** Gets the line and column indexes of the cell.
	 * @return
	 * 		Returns an object of the class Coordinate that has the line and columns indexes.
	 */
	Coordinate getCoordinate();
	
	/** Sets the line and column indexes to the cell table. This indexes must
	 * be natural numbers. If the value is above 1, the method throws a IndexOutOfBoundsException.
	 * @param lineIndex
	 * 		line index of the cell
	 * @param columnIndex
	 * 		column index of the cell
	 */
	void setCoordinates(Integer lineIndex, Integer columnIndex);	
	
	/** Sets the line and column indexes to the cell table. This indexes must
	 * be natural numbers. If the value is above 1, the method throws a IndexOutOfBoundsException.
	 * @param coordinate
	 * 		Coordinates of the line index and column index.
	 */
	void setCoordinates(Coordinate coordinate);
	
	/** Gets the text in the cell table,
	 * @return
	 * 		Returns the string inside of the cell table.
	 */
	String getText();
	
	/** Represents the line and columns coordinates of a cell.
	 * @author icaroclever
	 */
	class Coordinate {
		
		public Coordinate(Integer lineIndex, Integer columnIndex){
			this.lineIndex = lineIndex;
			this.columnIndex = columnIndex;
		}
		
		private Integer lineIndex;
		private Integer columnIndex;
		
		/** TODO
		 * @return the lineIndex
		 */
		public Integer getLineIndex() {
			return lineIndex;
		}
		/** TODO
		 * @return the columnIndex
		 */
		public Integer getColumnIndex() {
			return columnIndex;
		}
		/** TODO
		 * @param lineIndex the lineIndex to set
		 */
		public void setLineIndex(Integer lineIndex) {
			this.lineIndex = lineIndex;
		}
		/** TODO
		 * @param columnIndex the columnIndex to set
		 */
		public void setColumnIndex(Integer columnIndex) {
			this.columnIndex = columnIndex;
		}
	}
}
