package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.os.Linux;
import com.xworkz.xworkzapp.os.Os;
import com.xworkz.xworkzapp.os.Windows;

public class OsUtil {
	public static void main(String[] args) {

		//Windows windows = new Windows();
		Os windows = new Windows();
		windows.bit="Windows 64-bit OS";
		windows.vesrion="Version  10";
		windows.openSource=true;
		System.out.println(windows.bit+" "+windows.vesrion+" "+windows.openSource+"  windows is opens Source");
		
		//Linux linux = new Linux();
		Os linux = new Linux();
		//linux.provideSecure();
		linux.bit="Linux 128 bit";
		linux.vesrion="Version 7";
		linux.openSource=true;
		System.out.println(linux.bit+" "+ linux.vesrion+" "+linux.openSource+" Open Source ");

	}
}
