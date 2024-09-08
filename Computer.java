package cps2231_Homework5;
/***************************************************************
*
* Kean University
* Spring 2024
* Course: CPS*2231 - Computer Organization &Programming *
* Author: Elisha Smith, CPS 2231, section-02*
* Homework: 5, part 1
* Program Description: creating a parent class
***************************************************************/

import java.util.Date;

public class Computer {
	
	// data fields
	
	private String Manufacturer;
	private long DiskSize;
	private  String ManufacturingDate ;
	private int NumberofCores;

	
	
	public Computer() {
		
	}
	
	public Computer( String Manufacturer, long  DiskSize, String ManufacturingDate, int NumberofCores){
		this.Manufacturer = Manufacturer;
		this.DiskSize = DiskSize;
		this.ManufacturingDate = ManufacturingDate;
		this.NumberofCores = NumberofCores;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public long getDiskSize() {
		return DiskSize;
	}

	public void setDiskSize(long diskSize) {
		DiskSize = diskSize;
	}

	public String getManufacturingDate() {
		return ManufacturingDate;
	}

	public void setManufacturingDate(String manufacturingDate) {
		ManufacturingDate = manufacturingDate;
	}

	public int getNumberofCores() {
		return NumberofCores;
	}

	public void setNumberofCores(int numberofCores) {
		NumberofCores = numberofCores;
	}
	
	public String toString() {
		return  " Manufacturer: " + Manufacturer + "\n Disk Size: " + DiskSize + " bytes \n Manufacturing Date:" + ManufacturingDate + " \n Number of cores: " + NumberofCores + "\n" ;
	
		
	}
}
