package in.sanjeev.service;

import java.util.List;
import java.util.Optional;

import in.sanjeev.binding.DashboardResponse;
import in.sanjeev.binding.EnquiryForm;
import in.sanjeev.binding.EnquirySearchCriteria;
import in.sanjeev.entity.StudentEnqEntity;

public interface EnquiryService {

	public DashboardResponse getDashboardData(Integer userId);

	public List<String> getCourses();

	public List<String> getEnqStatuses();

	public boolean saveEnquiry(EnquiryForm form);

	public List<StudentEnqEntity> getEnquiries();
	
	public List<StudentEnqEntity> getFilteredEnqs(EnquirySearchCriteria criteria, Integer userId);

	public Optional<StudentEnqEntity> findById(Integer userId);

}
