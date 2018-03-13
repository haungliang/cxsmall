package cn.cxsc.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 组装类
 * 
 * @author Administrator
 *
 */
public class EasyUiDataGridResult implements Serializable {

	private long total;
	private List rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

}
