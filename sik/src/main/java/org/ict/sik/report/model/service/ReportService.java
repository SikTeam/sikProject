package org.ict.sik.report.model.service;
import java.util.ArrayList;

import org.ict.sik.common.Paging;
import org.ict.sik.report.model.vo.Report;

public interface ReportService {

	public ArrayList<Report> selectList(String keyword);
}
