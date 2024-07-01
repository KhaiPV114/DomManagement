document.addEventListener("DOMContentLoaded", function() {
    const slides = document.querySelectorAll('.mySlides');
    let currentSlide = 0;

    function showSlide(index) {
        for (let slide of slides) {
            slide.style.display = 'none';
        }
        slides[index].style.display = 'block';
        setTimeout(function() {
            currentSlide = (currentSlide + 1) % slides.length;
            showSlide(currentSlide);

            if (currentSlide === 0) {
                setTimeout(function() {
                    showSlide(currentSlide);
                }, 2000);
            }
        }, 2000);
    }

    showSlide(currentSlide);
});