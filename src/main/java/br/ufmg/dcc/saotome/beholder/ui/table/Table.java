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

import java.util.List;

import br.ufmg.dcc.saotome.beholder.ui.Component;
import br.ufmg.dcc.saotome.beholder.ui.event.Clickable;
import br.ufmg.dcc.saotome.beholder.ui.table.Cell.Coordinate;

/** Table class represents a table in HTML page. Disponibilize a way to find, interact and list
 * objects inside of the table.
 * 
 * @author icaroclever
 *
 */
public interface Table extends Component, Clickable{
	
	/** Get a cell of head of the table.
	 * 
	 * @param line
	 * 		head line table cell index
	 * @param column
	 * 		head column table cell index
	 * @return
	 * 		cell object
	 */
	Cell getHeadCell(Integer line, Integer column);
	
	/** Gets a cell of the head of the table using
	 * a cell cordinate.
	 * 
	 * @param coordinate
	 * 		cell cordinate to locate the cell
	 * @return
	 * 		Returns a cell object
	 */
	Cell getHeadCell(Coordinate coordinate);
	
	/** Get a cell of body of the table.
	 * 
	 * @param line
	 * 		head line table cell index
	 * @param column
	 * 		head column table cell index
	 * @return
	 * 		cell object
	 */
	Cell getCell(Integer line, Integer column);
	
	/** Gets a cell of the head of the table using
	 * a cell cordinate.
	 * 
	 * @param coordinate
	 * 		cell cordinate to locate the cell
	 * @return
	 * 		Returns a cell object
	 */
	Cell getCell(Coordinate coordinate);
	
	/** Gets a list of cells inside of a head line table.
	 * @param index
	 * 		index of the line
	 * @return
	 * 		a list of cells objects
	 */
	List<Cell> getHeadLineCells(Integer index);
	
	/** Gets a list of cells inside of a head line table.
	 * @param index
	 * 		index of the column
	 * @return
	 * 		a list of cells objects
	 */
	List<Cell> getHeadColumnCells(Integer index);
	
	/** Gets a list of cells inside of a foot line table.
	 * @param index
	 * 		index of the line
	 * @return
	 * 		a list of cells objects
	 */
	List<Cell> getFootLineCells(Integer index);
	
	/** Gets a list of cells inside of a foot line table.
	 * @param index
	 * 		index of the column
	 * @return
	 * 		a list of cells objects
	 */
	List<Cell> getFootColumnCells(Integer index);
	
	/** Gets a list of cells inside of a body line table.
	 * @param index
	 * 		index of the line
	 * @return
	 * 		a list of cells objects
	 */
	List<Cell> getLineCells(Integer index);
	
	/** Gets a list of cells inside of a body column table.
	 * @param index
	 * 		index of the column
	 * @return
	 * 		a list of cells objects
	 */
	List<Cell> getColumnCells(Integer index);
	
	/** Returns all cells of a table organized by line.
	 * @return List<List<Cell>>
	 */
	List<List<Cell>> getAllCellsByLine();

	/** Returns all cells of a table organized by column.
	 * @return List<List<Cell>>
	 */
	List<List<Cell>> getAllCellsByColumn();
	
	/** Returns all head cells of a table organized by line.
	 * @return List<List<Cell>>
	 */
	List<List<Cell>> getAllHeadCellsByLine();

	/** Returns all head cells of a table organized by column.
	 * @return List<List<Cell>>
	 */
	List<List<Cell>> getAllHeadCellsByColumn();
	
	/** Returns all foot cells of a table organized by line.
	 * @return List<List<Cell>>
	 */
	List<List<Cell>> getAllFootCellsByLine();

	/** Returns all foot cells of a table organized by column.
	 * @return List<List<Cell>>
	 */
	List<List<Cell>> getAllFootCellsByColumn();
	
}
