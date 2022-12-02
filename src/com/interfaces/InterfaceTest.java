package com.interfaces;

public class InterfaceTest {

	public static void main(String[] args) {

		IndianInstituteOfManagement iim = new IndianInstituteOfManagement();
		iim.EduGuide();
		iim.feePay();
		iim.feePayment();
		iim.GlobalEdu();
		iim.IndGuide();
		iim.ukEdu();
		iim.usEdu();
		iim.exam();
		iim.marks();

		System.out.println("----------------------------");

		USEducation us = new IndianInstituteOfManagement();
		us.EduGuide();
		us.feePayment();
		us.GlobalEdu();
		us.usEdu();

	}

}
