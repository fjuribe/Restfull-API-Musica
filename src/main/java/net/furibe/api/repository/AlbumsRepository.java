package net.furibe.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.furibe.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album,Integer>{

}
