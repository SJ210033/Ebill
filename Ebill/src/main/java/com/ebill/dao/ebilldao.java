package com.ebill.dao;

import com.ebill.entity.billentity;
import com.ebill.entity.billerentity;
import com.ebill.entity.staffentity;
import com.ebill.entity.studententity;

public interface ebilldao {
	public String savestudent(studententity  studententity);
	public studententity getstudententity(int rollno);
	public String savestaff(staffentity  staffentity);
	public staffentity getstaffentity(int id);
	public String savebiller(billerentity  billerentity);
	public billerentity getbillerentity(int id);
	public String savebillentity(billentity  billentity);
	public billentity getbillentity(int id);
}
