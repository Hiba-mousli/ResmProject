package The.Geeks.ResmProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import The.Geeks.ResmProject.Entities.Country;

@Repository

public interface CountryRepo extends JpaRepository<Country, Integer>{
    
}
