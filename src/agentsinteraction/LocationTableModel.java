/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentsinteraction;

/**
 *
 * @author ameerah
 */
// Import required Java classes 
import jade.core.Location;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

/**
@author Tiziana Trucco - CSELT S.p.A.
@version $Date: 2008-10-09 14:04:02 +0200 (gio, 09 ott 2008) $ $Revision: 6051 $
*/

public class LocationTableModel extends AbstractTableModel 
{
	Vector names;

	// CONSTRUCTORS
	public LocationTableModel() 
	{
		super();
		names = new Vector();
	}

	// ADD
	public void add(Location loc)
	{
		names.add((Object) loc);
	}
	
	// GETELEMENTAT
	public Location getElementAt(int index)
	{
		return((Location) names.get(index));
	}

	// CLEAR
	public void clear()
	{
		names.clear();
	}

	// Methods to be implemented to have a concrete class
	public int getRowCount()
	{
		return(names.size());
	}

	public int getColumnCount()
	{
		return(4);
	}

	public Object getValueAt(int row, int column)
	{
		String id, name, protocol, address;
		String value = ""; 
		Location loc = (Location) names.get(row);

		switch(column)
		{
		case 0:
			value = loc.getID();
			
			break;
		case 1:
				value = loc.getName();
			break;
		case 2:
			value = loc.getProtocol();
			break;
			case 3:
			value = loc.getAddress();
			break;
	
		}
		return ((Object) value);	
	}
}
