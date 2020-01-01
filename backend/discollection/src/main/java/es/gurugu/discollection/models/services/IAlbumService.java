package es.gurugu.discollection.models.services;

import java.util.List;

import es.gurugu.discollection.models.entity.Album;

public interface IAlbumService {
	
	public List<Album> findAll();
	
	public Album findById(Long id);
	
	public Album save (Album album);
	
	public void delete(Long id);

}
