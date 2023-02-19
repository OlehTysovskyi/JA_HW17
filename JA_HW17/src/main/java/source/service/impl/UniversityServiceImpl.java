package source.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import source.dao.UniversityRepository;
import source.domain.University;
import source.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityRepository universityRepository;

	@Override
	public University save(University university) {
		return universityRepository.saveAndFlush(university);
	}

	@Override
	public University findById(Long id) {
		return universityRepository.getOne(id);
	}

	@Override
	public University update(University university) {
		return universityRepository.save(university);
	}

	@Override
	public void deleteById(Long id) {
		universityRepository.deleteById(id);
	}

	@Override
	public List<University> findAll() {
		return null;
	}

}
