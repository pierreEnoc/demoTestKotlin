package com.enocp.demoTestKotlin.repository

import com.enocp.demoTestKotlin.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository: MongoRepository<Empresa, String> {
  fun findByCnpj(cnpj: String): Empresa
}