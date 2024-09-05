// Seleccionar los elementos de la página
const navLinks = document.querySelectorAll('.nav-link');
const contentDiv = document.getElementById('content');

// Función para cargar el contenido
function loadContent(url, callback) {
  fetch(url)
    .then(response => response.text())
    .then(data => {
      contentDiv.innerHTML = data;
      if (callback) callback();  // Ejecutar callback si está definido
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

    if (targetUrl === 'productos_mod.html') {
      loadContent(targetUrl, function() {
        // Ejecutar la lógica después de cargar productos_mod.html
        loadProductsFromServlet();
      });
    } else {
      loadContent(targetUrl);
    }
  });
});

// Cargar el contenido inicial
loadContent('inicio.html');


// Función para cargar productos desde el servlet
function loadProductsFromServlet() {
  fetch('http://localhost:8080/RLVDA/ListarProductos')
    .then(response => {
      if (!response.ok) {
        throw new Error('Error en la respuesta del servidor');
      }
      return response.json();
    })
    .then(data => {
      loadProducts(data);
    })
    .catch(error => {
      console.error('Error al cargar productos:', error);
    });
}

// Función para cargar productos en la tabla
function loadProducts(productList) {
  const tbody = document.getElementById('productList');
  tbody.innerHTML = ''; // Limpiar la tabla antes de cargar los nuevos datos
  productList.forEach(product => {
    const tr = document.createElement('tr');
    tr.innerHTML = `
      <td>${product.id_producto}</td>
      <td>${product.descripcion_producto}</td>
      <td>${product.stock}</td>
      <td>$${product.precio.toFixed(2)}</td>
      <td>${product.id_tipo_producto}</td>
      <td>
        <button class="btn btn-sm btn-info" data-toggle="tooltip" title="Ver">
          <i class="fas fa-eye"></i>
        </button>
        <button class="btn btn-sm btn-warning" data-toggle="tooltip" title="Modificar">
          <i class="fas fa-edit"></i>
        </button>
        <button class="btn btn-sm btn-danger" data-toggle="tooltip" title="Borrar">
          <i class="fas fa-trash-alt"></i>
        </button>
      </td>
    `;
    tbody.appendChild(tr);
  });

  // Inicializar tooltips de Bootstrap después de agregar nuevos elementos
  $('[data-toggle="tooltip"]').tooltip();
}