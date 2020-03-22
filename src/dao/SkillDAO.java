package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	public TreeMap<Skill,Integer> skillCount() throws SQLException{
		
		Connection con = null;
		try {
			con = ConnectionManager.getConnection();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			Statement statement = con.createStatement();
	
		
		int batsmen =0;
		int bowler =0;
		int allrounder = 0;
		int wk_batsmen = 0;
		
		ResultSet resultset = statement.executeQuery("Select * from Player");
		
		while (resultset.next()) {
			
		}
		
		return null;
		
	}
}

