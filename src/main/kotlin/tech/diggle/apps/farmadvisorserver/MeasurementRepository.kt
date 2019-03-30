package tech.diggle.apps.farmadvisorserver

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "measurements", path = "measurements")
interface MeasurementRepository : JpaRepository<Measurement, Long> {
    fun findTopByOrderByIdDesc(): Measurement?
}