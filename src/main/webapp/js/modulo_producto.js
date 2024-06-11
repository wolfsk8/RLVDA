// app.js
$(document).ready(function() {
    console.log(2212);
    // Función para cargar productos desde el servlet
    function loadProductsFromServlet() {
        $.ajax({
            url: 'RLVDA/ListarProductos', // Reemplaza 'ruta/a/tu/servlet' con la URL de tu servlet
            type: 'GET',
            dataType: 'json',
            success: function(response) {
                loadProducts(response);
            },
            error: function(xhr, status, error) {
                console.error('Error al cargar productos:', error);
                console.log("punto");
            }
        });
    }
         // Función para cargar productos en la tabla
    function loadProducts(productList) {
        const tbody = $('#productList');
        tbody.empty(); // Limpiar la tabla antes de cargar los nuevos datos
        productList.forEach(product => {
            const tr = $('<tr>');
            tr.html(`
                <td>${product.id_producto}</td>
                <td>${product.descripcion_producto}</td>
                <td>${product.stock}</td>
                <td>$${product.price.toFixed(2)}</td>
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
            `);
            tbody.append(tr);
        });
    }
    
    // Cargar productos al iniciar la página
    loadProductsFromServlet();
    
         // Función para buscar productos
    $('#searchInput').on('input', function() {
        const input = $(this).val().toLowerCase();
        const filteredProducts = products.filter(product => 
            product.name.toLowerCase().includes(input) || 
            product.id.toString().includes(input) ||
            product.price.toString().includes(input)
        );
        loadProducts(filteredProducts);
    });

    // Inicializar tooltips de Bootstrap
    $('[data-toggle="tooltip"]').tooltip();
});