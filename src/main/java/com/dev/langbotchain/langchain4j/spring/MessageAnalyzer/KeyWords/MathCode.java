package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords;

import java.util.List;

public class MathCode {
    public static final List<String> MATH_SENTENCES = List.of(
            "What's the difference between integration and differentiation?",
            "How do I solve quadratic equations using the quadratic formula?",
            "Can you explain the concept of vectors in three-dimensional space?",
            "What are the properties of prime numbers?",
            "What is the Pythagorean theorem and how is it used?",
            "Is it possible to find the area of a circle without using pi?",
            "What's the difference between arithmetic and geometric sequences?",
            "Can you recommend any resources for learning calculus?",
            "How do I plot graphs of functions like sine and cosine?",
            "What are some common applications of probability theory?",
            "What is the significance of Euler's formula in complex analysis?",
            "How can I calculate the volume of irregular shapes?",
            "What is the concept of limits in calculus?",
            "How do I find the roots of a polynomial equation?",
            "What is the difference between a logarithm and an exponent?",
            "Can you explain the concept of matrices and their operations?",
            "How do I calculate permutations and combinations?",
            "What is the purpose of statistical hypothesis testing?",
            "How do I interpret graphs of functions and their derivatives?",
            "What are the properties of rational and irrational numbers?",
            "How can I use mathematical induction to prove statements?",
            "What are some strategies for solving optimization problems?",
            "How do I apply the binomial theorem in probability?",
            "What is the concept of continuity in calculus?",
            "How do I find the area under a curve using integration?",
            "What is the significance of eigenvalues and eigenvectors?",
            "How can I solve systems of linear equations?",
            "What are some real-world applications of Fourier transforms?",
            "How do I analyze the convergence of infinite series?",
            "How do I use Taylor series to approximate functions?",
            "Create a Mathematical Model",
            "What's the difference between integration and differentiation?",
            "How do I solve quadratic equations using the quadratic formula?",
            "Can you explain the concept of vectors in three-dimensional space?",
            "What are the properties of prime numbers?",
            "What is the Pythagorean theorem and how is it used?",
            "Is it possible to find the area of a circle without using pi?",
            "What's the difference between arithmetic and geometric sequences?",
            "Can you recommend any resources for learning calculus?",
            "How do I plot graphs of functions like sine and cosine?",
            "What are some common applications of probability theory?",
            "What is the significance of Euler's formula in complex analysis?",
            "How can I calculate the volume of irregular shapes?",
            "What is the concept of limits in calculus?",
            "How do I find the roots of a polynomial equation?",
            "What is the difference between a logarithm and an exponent?",
            "Can you explain the concept of matrices and their operations?",
            "How do I calculate permutations and combinations?",
            "What is the purpose of statistical hypothesis testing?",
            "How do I interpret graphs of functions and their derivatives?",
            "What are the properties of rational and irrational numbers?",
            "How can I use mathematical induction to prove statements?",
            "What are some strategies for solving optimization problems?",
            "How do I apply the binomial theorem in probability?",
            "What is the concept of continuity in calculus?",
            "How do I find the area under a curve using integration?",
            "What is the significance of eigenvalues and eigenvectors?",
            "How can I solve systems of linear equations?",
            "What are some real-world applications of Fourier transforms?",
            "How do I analyze the convergence of infinite series?",
            "How do I use Taylor series to approximate functions?",
            "Create a Mathematical Model",
            "What is the concept of set theory and its operations?",
            "How do I prove mathematical identities?",
            "What are the different types of numbers in mathematics?",
            "How do I find the domain and range of a function?",
            "What is the significance of the Fundamental Theorem of Algebra?",
            "Can you explain the concept of combinatorial analysis?",
            "What are the properties of geometric shapes like triangles and circles?",
            "How do I apply the laws of exponents in algebraic expressions?",
            "What is the concept of absolute value and its properties?",
            "How do I solve inequalities and interval notation?",
            "What is the significance of functions and their graphs?",
            "How can I use mathematical induction to prove inequalities?",
            "What are some strategies for solving word problems in algebra?",
            "How do I find the slope of a line and its equation?",
            "What is the concept of logarithmic functions and their properties?",
            "How do I use trigonometric functions like sine, cosine, and tangent?",
            "What are the properties of angles and their measures?",
            "How do I apply the laws of sine and cosine in trigonometry?",
            "What is the concept of polar coordinates and their conversion?",
            "How can I use vectors to solve geometric problems?",
            "What are some real-world applications of geometry?",
            "How do I find the volume and surface area of three-dimensional shapes?",
            "What is the concept of similarity and congruence in geometry?",
            "How do I use the Pythagorean theorem to solve problems?",
            "What are the properties of circles and their equations?",
            "How can I apply transformations to geometric shapes?",
            "What is the concept of conic sections and their equations?",
            "How do I analyze the properties of triangles and polygons?",
            "Create a Mathematical Model",
            "What is the concept of set theory and its operations?",
            "How do I prove mathematical identities?",
            "What are the different types of numbers in mathematics?",
            "How do I find the domain and range of a function?",
            "What is the significance of the Fundamental Theorem of Algebra?",
            "Can you explain the concept of combinatorial analysis?",
            "What are the properties of geometric shapes like triangles and circles?",
            "How do I apply the laws of exponents in algebraic expressions?",
            "What is the concept of absolute value and its properties?",
            "How do I solve inequalities and interval notation?",
            "What is the significance of functions and their graphs?",
            "How can I use mathematical induction to prove inequalities?",
            "What are some strategies for solving word problems in algebra?",
            "How do I find the slope of a line and its equation?",
            "What is the concept of logarithmic functions and their properties?",
            "How do I use trigonometric functions like sine, cosine, and tangent?",
            "What are the properties of angles and their measures?",
            "How do I apply the laws of sine and cosine in trigonometry?",
            "What is the concept of polar coordinates and their conversion?",
            "How can I use vectors to solve geometric problems?",
            "What are some real-world applications of geometry?",
            "How do I find the volume and surface area of three-dimensional shapes?",
            "What is the concept of similarity and congruence in geometry?",
            "How do I use the Pythagorean theorem to solve problems?",
            "What are the properties of circles and their equations?",
            "How can I apply transformations to geometric shapes?",
            "What is the concept of conic sections and their equations?",
            "How do I analyze the properties of triangles and polygons?",
            "Create a Mathematical Model",
            "How do I prove mathematical theorems using induction?",
            "What is the concept of limits and continuity in calculus?",
            "How do I find derivatives of functions and their applications?",
            "What are some techniques for finding antiderivatives?",
            "What is the significance of the Mean Value Theorem in calculus?",
            "Can you explain the concept of Riemann sums and their role in integration?",
            "How do I solve differential equations and their applications?",
            "What are the properties of sequences and series?",
            "How can I apply Taylor series to approximate functions?",
            "What is the concept of multivariable calculus and its applications?",
            "How do I find partial derivatives and their applications?",
            "What are the properties of double and triple integrals?",
            "How can I use line integrals and surface integrals in vector calculus?",
            "What is the significance of Green's theorem and Stokes' theorem?",
            "How do I apply divergence and curl in vector calculus?",
            "What are some real-world applications of calculus?",
            "How do I solve optimization problems using calculus techniques?",
            "What is the concept of differential geometry and its applications?",
            "How do I analyze vector fields and their properties?",
            "What are some applications of Laplace transforms in engineering?",
            "How do I use Fourier series to solve partial differential equations?",
            "What is the concept of tensors and their applications in physics?",
            "Create a Mathematical Model"
    );


    public static final List<String> MATH_KEYWORDS = List.of(
            "absolute",
            "acceleration",
            "algebra",
            "angle",
            "antiderivative",
            "apex",
            "arccosine",
            "arcsine",
            "arctangent",
            "area",
            "argument",
            "arithmetic",
            "array",
            "asymptote",
            "axis",
            "base",
            "binomial",
            "calculus",
            "cardinality",
            "centroid",
            "circle",
            "coefficient",
            "combination",
            "common",
            "compass",
            "complement",
            "complex",
            "congruence",
            "conic",
            "constant",
            "coordinate",
            "cosine",
            "cotangent",
            "curve",
            "cylinder",
            "decimal",
            "degree",
            "delta",
            "derivative",
            "determinant",
            "diagonal",
            "difference",
            "differentiation",
            "digit",
            "dimension",
            "direction",
            "discrete",
            "distance",
            "divergence",
            "division",
            "domain",
            "dot",
            "ellipse",
            "equation",
            "equilateral",
            "equality",
            "exponent",
            "expression",
            "factor",
            "factorial",
            "fraction",
            "function",
            "geometry",
            "graph",
            "hexagon",
            "hyperbola",
            "identity",
            "imaginary",
            "inequality",
            "infinite",
            "inflection",
            "integer",
            "integral",
            "intersect",
            "irrational",
            "isometry",
            "knot",
            "limit",
            "line",
            "logarithm",
            "logic",
            "magnitude",
            "matrix",
            "mean",
            "measure",
            "median",
            "minimize",
            "mode",
            "modulus",
            "moment",
            "monomial",
            "multiple",
            "negative",
            "notation",
            "null",
            "numerator",
            "octagon",
            "operation",
            "optimization",
            "orthogonal",
            "parallel",
            "parabola",
            "parameter",
            "percent",
            "perimeter",
            "period",
            "perpendicular",
            "pi",
            "plane",
            "plot",
            "point",
            "polygon",
            "polynomial",
            "positive",
            "power",
            "prime",
            "probability",
            "product",
            "proportion",
            "property",
            "proof",
            "quadrant",
            "quadratic",
            "quantity",
            "quartile",
            "quotient",
            "radical",
            "radius",
            "ratio",
            "rational",
            "real",
            "reciprocal",
            "rectangle",
            "reflection",
            "regression",
            "relation",
            "remainder",
            "repeating",
            "representation",
            "resolution",
            "respective",
            "resultant",
            "rhombus",
            "root",
            "rotation",
            "scalar",
            "segment",
            "sequence",
            "series",
            "set",
            "simplify",
            "sine",
            "slope",
            "solid",
            "solution",
            "solve",
            "space",
            "sphere",
            "square",
            "standard",
            "statistics",
            "subtraction",
            "symmetry",
            "tangent",
            "theorem",
            "topology",
            "torus",
            "trapezoid",
            "triangle",
            "trigonometry",
            "undefined",
            "union",
            "unit",
            "value",
            "variable",
            "vector",
            "vertex"
    );

}