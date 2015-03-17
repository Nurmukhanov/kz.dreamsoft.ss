package kz.dreamsoft.repository;

import java.util.List;

import com.mysql.fabric.xmlrpc.base.Param;

public interface ParamDAO {
	 public void addParam(Param param);
	 public void updateParam(Param param);
	 public List<Param> listParams();
	 public Param getParamById(int id);
	 public void removeParam(int id);
}
