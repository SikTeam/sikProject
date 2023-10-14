package org.ict.sik.report.model.service;

import java.util.ArrayList;

import org.ict.sik.common.Paging;
import org.ict.sik.report.model.dao.ReportDao;
import org.ict.sik.report.model.vo.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("reportService")
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private ReportDao reportDao;
	
	public ArrayList<Report> selectList(String keyword){
		return reportDao.selectList(keyword);
	}
}