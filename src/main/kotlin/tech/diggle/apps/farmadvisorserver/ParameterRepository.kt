package tech.diggle.apps.farmadvisorserver

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "parameters", path = "parameters")
interface ParameterRepository : PagingAndSortingRepository<Parameter, Long> {
    fun findTopByOrderByIdDesc(): Parameter?
    fun findTopByOrderById(): Parameter?
}