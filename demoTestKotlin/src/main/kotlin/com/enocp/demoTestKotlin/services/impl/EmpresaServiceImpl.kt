package com.enocp.demoTestKotlin.services.impl

import com.enocp.demoTestKotlin.documents.Empresa
import com.enocp.demoTestKotlin.repository.EmpresaRepository
import com.enocp.demoTestKotlin.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {
  
  
  override fun buscarPorCnpj(cnpj: String): Empresa? {
    try {
      return empresaRepository.findByCnpj(cnpj)
    } catch (e: Exception) {
      return null
    }
  }
  
  override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)
}