let showModalLogin = false;

$(document).ready(function () {
    if ('@Request["isShowLogin"]' === 'true') {
        handleShowModal();
    }

    campusChange();
});

function campusChange() {
    var campus = document.getElementById("CampusCode").value;
    var valueGoogle = document.getElementById("google_login").href;
    var valueFEID = document.getElementById("feid_login").href;
    var campusIndexGoogle = valueGoogle.lastIndexOf('=');
    var campusIndexFEID = valueFEID.lastIndexOf('=');
    document.getElementById("google_login").href = valueGoogle.substring(0, campusIndexGoogle + 1) + campus;
    document.getElementById("feid_login").href = valueFEID.substring(0, campusIndexFEID + 1) + campus;
}
const loginModalTag = document.getElementById("loginModal");
var button = document.getElementById("btnLogin");

// Thêm sự kiện click
button.addEventListener("click", function () {
    handleShowModal();
});

const handleShowModal = () => {
    loginModalTag.style.display = "flex";
};

const handleCloseModal = () => {
    loginModalTag.style.display = "none";
};

if (window.location.href.includes("Home")) {
    loginModalTag.classList.remove("hidden");
}

const loginTab1 = document.getElementById("loginTab1");
const loginTab2 = document.getElementById("loginTab2");
const loginTab3 = document.getElementById("loginTab3");

const activeTab = (tab) => {
    const username = document.getElementById("fieldUsername");
    const password = document.getElementById("fieldPassword");

    const account = document.getElementById("login-account");
    const google = document.getElementById("login-google");
    const feid = document.getElementById("login-feid");

    //if (tab == 1) {
    //    loginTab1.classList.add("role-text-active");
    //    loginTab2.classList.remove("role-text-active");

    //    username.classList.add("hidden");
    //    password.classList.add("hidden");
    //    account.classList.add("hidden");

    //    google.classList.remove("hidden");
    //    feid.classList.remove("hidden");
    //} else if (tab == 2) {
    //    loginTab1.classList.remove("role-text-active");
    //    loginTab2.classList.add("role-text-active");

    //    username.classList.remove("hidden");
    //    password.classList.remove("hidden");
    //    account.classList.remove("hidden");

    //    google.classList.add("hidden");
    //    feid.classList.add("hidden");
    //}
};

// QA

const listQA = document.getElementById("QA-content");

const showQA = (index) => {
    if (
        !listQA.children[index].children[1].classList["value"].includes("hidden")
    ) {
        listQA.children[index].children[1].classList.add("hidden");
    } else {
        listQA.children[index].children[1].classList.remove("hidden");
    }
};

// Get the button
let scrollTop = document.getElementById("scrollTop");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function () {
    scrollFunction();
};

function scrollFunction() {
    if (document.documentElement.scrollTop > 500) {
        scrollTop.style.display = "block";
    } else {
        scrollTop.style.display = "none";
    }
}

const smoothScroll = () => {
    let h = document.documentElement.scrollTop;
    let myInterval = setInterval(function () {
        document.documentElement.scrollTo(0, h);
        h -= 100;
        if (h <= 0) {
            clearInterval(myInterval);
            document.documentElement.scrollTo(0, 0);
        }
    }, 10);
};

let slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
    showSlides((slideIndex += n));
}

function currentSlide(n) {
    showSlides((slideIndex = n));
}

function showSlides(n) {
    let i;
    let slides = document.getElementsByClassName("mySlides");

    if (n > slides.length) {
        slideIndex = 1;
    }
    if (n < 1) {
        slideIndex = slides.length;
    }
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }

    slides[slideIndex - 1].style.display = "block";
}

// setInterval(() => plusSlides(1), 10000);
