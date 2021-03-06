package com.alkemy.icoons.icons.service;

import java.util.List;
import java.util.Set;

import com.alkemy.icoons.icons.dto.IconDTO;
import com.alkemy.icoons.icons.dto.IconSimpleDTO;

public interface IconService {
	public List<IconSimpleDTO> getAll();

	public IconDTO save(IconDTO iconDTO);

	public IconDTO getDetailsById(Long id);

	public List<IconDTO> getByFilters(String name, String date, Set<Long> cities, String order);
	
	public IconDTO update(Long id, IconDTO iconDTO);
	
	public void addPais(Long id, Long idPais);
	
	public void removePais(Long id, Long idPais);
	
	public void delete(Long id);
}
