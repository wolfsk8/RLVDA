// Seleccionar los elementos de la página
const navLinks = document.querySelectorAll('.nav-link');
const contentDiv = document.getElementById('content');

// Función para cargar el contenido
function loadContent(url) {
  fetch(url)
    .then(response => response.text())
    .then(data => {
      contentDiv.innerHTML = data;
    })
    .catch(error => {
      console.error('Error al cargar el contenido:', error);
    });
}

// Agregar event listeners a los enlaces de navegación
navLinks.forEach(link => {
  link.addEventListener('click', event => {
    event.preventDefault(); // Evitar que el enlace navegue
    const targetUrl = event.target.dataset.target; // Obtener la URL objetivo
    loadContent(targetUrl); // Cargar el contenido correspondiente
  });
});

// Cargar el contenido inicial
loadContent('inicio.html');