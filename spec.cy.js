/// <reference types="cypress"/>

it("Spectrocoin test", () => {
  cy.visit("https://spectrocoin.com/")
  cy.get('button[data-cy="accept-btn"]').click()
  cy.wait(1500)
  cy.contains('All currencies').click()
  cy.wait(1500)
  cy.contains('USD').click()
  cy.contains('EUR').click()
  cy.get('.css-1836tev').should('have.text', 'EUR')
  cy.get('tr:nth-child(1) td:nth-child(3)').then(($element) => {
    if ($element.hasClass('MobileTable_green__uQizf')) {
      cy.wrap($element).should('have.css', 'color', 'rgb(83, 199, 137)')
    } else if ($element.hasClass('MobileTable_red__robxd')) {
      cy.wrap($element).should('have.css', 'color', 'rgb(221, 75, 100)')
    }
  })
})
