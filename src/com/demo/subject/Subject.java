package com.demo.subject;

import java.util.ArrayList;
import java.util.List;

import com.demo.observer.Observer;

public abstract class Subject {
	/**
	 * 用来保存注册的观察者对象
	 */
	private List<Observer> list = new ArrayList<Observer>();

	/**
	 * 注册观察者对象
	 * 
	 * @param observer
	 *            观察者对象
	 */
	public void attach(Observer observer) {
		list.add(observer);
		System.out.println("绑定成功");
	}

	/**
	 * 删除观察者对象
	 * 
	 * @param observer
	 *            观察者对象
	 */
	public void detach(Observer observer) {

		list.remove(observer);
	}

	/**
	 * 通知所有注册的观察者对象
	 */
	public void nodifyObservers(String newState) {

		for (Observer observer : list) {
			observer.update(newState);
		}
	}
}