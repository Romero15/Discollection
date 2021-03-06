package es.gurugu.discollection.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.gurugu.discollection.models.dao.IAlbumDao;
import es.gurugu.discollection.models.entity.Album;

@Service
public class AlbumServiceImpl implements IAlbumService {
	
	@Autowired
	private IAlbumDao albumDao;

	@Override
	@Transactional(readOnly = true)
	public List<Album> findAll() {
		return (List<Album>) albumDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Album findById(Long id) {
		//si no lo encuentra, retorna un null
		return albumDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Album save(Album album) {
		return albumDao.save(album);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		albumDao.deleteById(id);
		
	}

}
