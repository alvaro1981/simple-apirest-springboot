package com.example.ApiRestGPT.controller

import com.example.ApiRestGPT.model.Usuario
import com.example.ApiRestGPT.repository.UsuarioRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/usuarios")
class UsuarioController(private val usuarioRepository: UsuarioRepository) {

    @GetMapping
    fun listarUsuarios(): List<Usuario> = usuarioRepository.findAll()

    @PostMapping
    fun crearUsuario(@RequestBody usuario: Usuario): Usuario = usuarioRepository.save(usuario)

    @GetMapping("/{id}")
    fun obtenerUsuario(@PathVariable id: Long): Usuario =
        usuarioRepository.findById(id).orElseThrow { RuntimeException("Usuario no encontrado") }
}