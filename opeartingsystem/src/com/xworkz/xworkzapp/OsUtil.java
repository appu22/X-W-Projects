package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.os.Linux;
import com.xworkz.xworkzapp.os.Os;
import com.xworkz.xworkzapp.os.Windows;

public class OsUtil {
	public static void main(String[] args) {

		//Windows windows = new Windows();
		Os windows = new Windows();
		windows.bit="64-bit OS";
		windows.vesrion="Version  10";
		windows.openSource=true;
		System.out.println(windows.bit+" \n"+windows.vesrion+"\n "+windows.openSource+"  windows is opens Source");
		
		//Linux linux = new Linux();
		Os linux = new Linux();
		//linux.provideSecure();
		linux.bit="128 bit";
		linux.vesrion="7 linux os";
		linux.openSource=true;
		System.out.println(linux.bit+"\n"+ linux.vesrion+"\n"+linux.openSource+""+linux.openSource+" Open Source ");

	}
}
