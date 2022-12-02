package com.interfaces;

public class IndianInstituteOfManagement extends ICET implements IndianEducation, USEducation, UKEducation {

	@Override
	public void EduGuide() {
		System.out.println("Global Education Guidelines");
	}

	@Override
	public void GlobalEdu() {
		System.out.println("Worldwide guidelines for education");
	}

	@Override
	public void ukEdu() {
		System.out.println("UK education");
	}

	@Override
	public void usEdu() {
		System.out.println("US education");
	}

	@Override
	public void IndGuide() {
		System.out.println("Indian education");
	}

	@Override
	public void feePayment() {
		System.out.println("Fee payment");
	}

	public void feePay() {
		System.out.println("IIM fee payment");

	}
}
