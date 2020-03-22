package controller;

import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;

public class Main{
	
	SkillDAO skilldao = new SkillDAO();
	
	 TreeMap<Skill,Integer> sc = new TreeMap<Skill,Integer>();
	 
	 sc = skilldao.skillCount();
		System.out.println("Id"+"\t"+"name"+"\t"+"count");

}
