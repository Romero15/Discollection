package es.gurugu.discollection.models.dao;

import org.springframework.data.repository.CrudRepository;

import es.gurugu.discollection.models.entity.Album;

public interface IAlbumDao extends CrudRepository<Album, Long>{

}
