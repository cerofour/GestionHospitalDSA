*Propuesta de Proyecto: Sistema de Gestión Hospitalaria Inteligente*

### *Descripción General*
Desarrollar un sistema de gestión hospitalaria que integre múltiples estructuras de datos para administrar pacientes, médicos, citas, historiales médicos y diagnósticos. El sistema priorizará eficiencia en operaciones críticas (como emergencias) y permitirá deshacer acciones, garantizando modularidad y persistencia de datos.

---

### *Estructuras de Datos y su Aplicación*
1. *Arreglo Unidimensional*
    - *Entidad principal*: Lista de pacientes registrados.
    - *Funciones*: Inserción (nuevos pacientes), eliminación lógica (marcar como "inactivo"), ordenamiento por ID (para búsqueda binaria).

2. *Lista Enlazada Doble*
    - *Interacción cronológica*: Historial médico de cada paciente.
    - *Funciones*: Agregar eventos (consultas, cirugías), eliminar registros erróneos, recorrido bidireccional para revisar historial.

3. *Cola con Prioridad*
    - *Atención de emergencias*: Gestión de citas por prioridad (urgencia alta, media, baja).
    - *Funciones*: FIFO dentro de cada nivel de prioridad, atención según gravedad.

4. *Pila Dinámica*
    - *Acciones reversibles*: Deshacer hasta 5 acciones (ej. eliminación de pacientes, cancelación de citas).

5. *Árbol Binario de Búsqueda (ABB)*
    - *Organización jerárquica*: Clasificación de pacientes por especialidad médica (ej. cardiología, pediatría).

6. *Árbol AVL*
    - *Eficiencia en búsqueda*: Registro de médicos equilibrado por ID, permitiendo inserción, eliminación y búsqueda rápida.

7. *TAD Personalizado*
    - *Árbol de decisiones médicas*: Nodos representan síntomas o preguntas; las ramas conducen a diagnósticos posibles (ej. fiebre → tos → COVID-19).

---

### *Clases Principales (Mínimo 5)*
1. *Paciente*: Atributos (ID, nombre, edad, estado), métodos para gestionar historial.
2. *Médico*: Atributos (ID, especialidad, disponibilidad), vinculado al árbol AVL.
3. *Cita*: Atributos (fecha, prioridad, paciente, médico), gestionada por la cola con prioridad.
4. *SistemaHospital*: Clase principal con menú interactivo y gestión de estructuras.
5. *HistorialMedico*: Vinculado a lista doblemente enlazada para registrar eventos.
6. *ArbolDiagnostico*: TAD personalizado para árbol de decisiones médicas.

---

### *Validación y Persistencia*
- *Validación de entradas*: Verificación de formatos (ej. fechas válidas, IDs únicos).
- *Manejo de errores*: Notificaciones al usuario (ej. "Paciente no encontrado", "Prioridad inválida").
- *Persistencia*: Guardado en archivos de texto/JSON para pacientes, médicos y citas.

---

### *Interfaz de Usuario*
- *Menú de consola* con opciones:  
  plaintext
    1. Registrar paciente
    2. Agendar cita (prioridad alta/media/baja)
    3. Ver historial médico
    4. Cancelar cita (deshacer con pila)
    5. Buscar médico (AVL)
    6. Diagnóstico asistido (TAD personalizado)
    7. Salir y guardar datos


---

### *Retos Técnicos y Soluciones*
- *Integración de estructuras*: Usar clases separadas para cada estructura y evitar acoplamiento.
- *Balanceo en AVL*: Implementar rotaciones automáticas durante inserciones/eliminaciones.
- *Persistencia*: Serialización de datos para recuperación después de cerrar el programa.

---

### *Cumplimiento de Requisitos*
- *5+ clases*: Paciente, Médico, Cita, SistemaHospital, HistorialMedico, ArbolDiagnostico.
- *Estructuras cubiertas*: Arreglo, lista doble, cola priorizada, pila, ABB, AVL, TAD.
- *Documentación*: Diagrama de clases, justificación de estructuras, manual de usuario en README.

*Ejemplo de Caso de Uso*:  
Un paciente con dolor de pecho (prioridad alta) es atendido primero. Su historial se actualiza con una lista doble, y el médico consulta el árbol AVL para ver disponibilidad. Si se cancela la cita por error, se usa la pila para revertir la acción.

Este proyecto cumple con todos los requisitos técnicos y permite escalabilidad futura (ej. añadir GUI o machine learning para diagnósticos).


dame los requerimientos funcionales ya que realizare esta aplicación en javaFX

1. Gestión de Pacientes

   RF1: Registrar nuevo paciente

        Entradas: ID único, nombre completo, edad, estado (activo/inactivo).

        Validación: ID único, edad > 0, nombre no vacío.

   RF2: Eliminación lógica de pacientes

        Marcar paciente como "inactivo" (no eliminación física).

   RF3: Búsqueda binaria de pacientes

        Buscar pacientes por ID en arreglo ordenado.

   RF4: Listado de pacientes

        Mostrar tabla con todos los pacientes (ID, nombre, edad, estado).

2. Gestión de Médicos (Árbol AVL)

   RF5: Registrar médico

        Entradas: ID único, nombre, especialidad (cardiólogo, pediatra, etc.), disponibilidad.

   RF6: Eliminar médico

        Eliminar nodo del árbol AVL manteniendo balanceo.

   RF7: Búsqueda eficiente de médicos

        Buscar por ID en el árbol AVL (log n).

   RF8: Listar médicos por especialidad

        Mostrar árbol jerárquico o tabla filtrable.

3. Gestión de Citas (Cola de Prioridad)

   RF9: Agendar cita

        Entradas: Paciente (ID), médico (ID), fecha/hora, prioridad (alta/media/baja).

        Validación: Fecha futura, IDs existentes.

   RF10: Atención de citas por prioridad

        Mostrar próxima cita a atender (FIFO dentro de cada nivel de prioridad).

   RF11: Cancelar cita

        Eliminar cita y registrar acción en pila de "deshacer".

4. Historial Médico (Lista Doble Enlazada)

   RF12: Agregar evento al historial

        Entradas: Fecha, tipo (consulta/cirugía), descripción, médico responsable.

   RF13: Visualización bidireccional del historial

        Navegar eventos con botones "Anterior/Siguiente".

   RF14: Eliminar evento

        Eliminar registro erróneo (acción reversible con pila).

5. Diagnóstico Asistido (TAD Personalizado)

   RF15: Guiar diagnóstico mediante árbol de decisiones

        Mostrar preguntas/síntomas en cascada (ej: "¿Tiene fiebre?" → "¿Tos persistente?").

   RF16: Mostrar diagnóstico final

        Alerta con posible enfermedad y recomendaciones.

6. Funciones de Deshacer (Pila Dinámica)

   RF17: Deshacer acciones recientes

        Revertir hasta 5 operaciones (eliminaciones de citas, eventos, pacientes).

   RF18: Mostrar historial de acciones reversibles

        Lista de últimas acciones realizadas (ej: "Cita eliminada: Dr. López - 15/Jun").

7. Persistencia de Datos

   RF19: Guardar datos en archivos

        Exportar pacientes, médicos y citas a JSON/XML al cerrar la aplicación.

   RF20: Cargar datos al iniciar

        Importar datos desde archivos (validar integridad).

8. Interfaz Gráfica (JavaFX)

   RF21: Menú principal interactivo

        Accesos rápidos a módulos (citas, pacientes, diagnósticos).

   RF22: Formularios con validación visual

        Campos con marcadores de error (ej: ID inválido).

   RF23: Tablas dinámicas y filtros

        Ordenar/filtrar pacientes por nombre, médicos por especialidad, etc.

   RF24: Visualización de estructuras

        Mostrar árbol AVL de médicos y árbol de decisiones con gráficos.

9. Reportes y Alertas

   RF25: Generar reportes de ocupación

        Citas agendadas por día, pacientes atendidos por especialidad.

   RF26: Notificaciones emergentes

        Alertar citas prioritarias o conflictos (ej: médico no disponible).

10. Configuración del Sistema

    RF27: Personalizar límite de "deshacer"

        Permitir cambiar el número máximo de acciones reversibles (default: 5).

    RF28: Restablecer datos demo

        Opción para cargar datos de prueba (testing).

Validación Adicional

    RF29: Control de entradas críticas

        Evitar citas duplicadas, IDs repetidos, fechas inválidas.

    RF30: Manejo de errores gráfico

        Mostrar diálogos descriptivos para errores (ej: "Paciente no encontrado").

Flujo Típico en JavaFX

    Inicio: Pantalla de login (médico/admin).

    Dashboard:

        Panel con resumen de citas del día, alertas prioritarias.

        Accesos a módulos laterales (Pacientes, Médicos, Citas, Diagnósticos).

    Registro de Paciente:

        Formulario con campos validados + botón "Guardar".

    Agendar Cita:

        Selector de paciente/médico + prioridad (botones de color: rojo/amarillo/verde).

    Árbol de Decisiones:

        Interfaz tipo wizard ("Pregunta 1 de 3") con botones Sí/No.

Requerimientos No Funcionales

    RNF1: Rendimiento

        Búsquedas en < 100 ms (10,000 registros).

    RNF2: Usabilidad

        Diseño responsive (móvil/escritorio).

    RNF3: Seguridad

        Acceso por roles (médico vs administrador).