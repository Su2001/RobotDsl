package org.xtext.example.mydsl1;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import project2.Action;
import project2.Condition;

public class MyRobotDSLQNP extends DefaultDeclarativeQualifiedNameProvider{
	public QualifiedName qualifiedName(Action a) {
		return QualifiedName.create(a.getActionname());
	}
	
	public QualifiedName qualifiedName(Condition c) {
		return QualifiedName.create(c.getConditionname());
	}
}
